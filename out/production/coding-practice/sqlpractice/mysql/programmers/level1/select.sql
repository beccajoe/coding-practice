-- 여러 기준으로 정렬하기
-- 동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 단, 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.
SELECT animal_id, name, datetime from animal_ins order by name asc, datetime desc;

-- 어린 동물 찾기
-- 동물 보호소에 들어온 동물 중 젊은 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.
SELECT animal_id, name from animal_ins where not intake_condition = 'Aged' order by animal_id;

-- 아픈 동물 찾기
-- 동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 이때 결과는 아이디 순으로 조회해주세요.
select animal_id, name from animal_ins where intake_condition = 'Sick' order by animal_id;

-- 동물의 아이디와 이름
SELECT animal_id, name from animal_ins order by animal_id;

-- 역순 정렬하기
-- 동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 이때 결과는 ANIMAL_ID 역순으로 보여주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.
SELECT name, datetime from animal_ins order by animal_id desc;

-- 상위 n개 레코드
-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
SELECT name from animal_ins order by datetime limit 1;
 
-- 강원도에 위치한 생산공장 목록 출력하기
-- FOOD_FACTORY 테이블에서 강원도에 위치한 식품공장의 공장 ID, 공장 이름, 주소를 조회하는 SQL문을 작성해주세요. 이때 결과는 공장 ID를 기준으로 오름차순 정렬해주세요.
SELECT factory_id, factory_name, address from food_factory where address like '강원도%' order by factory_id;
 
-- 조건에 맞는 회원수 구하기
-- USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.
SELECT count(user_id) as 'USERS' from user_info where joined like '2021-%' and age between 20 and 29;
 
-- 흉부외과 또는 일반외과 의사 목록 출력하기
-- DOCTOR 테이블에서 진료과가 흉부외과(CS)이거나 일반외과(GS)인 의사의 이름, 의사ID, 진료과, 고용일자를 조회하는 SQL문을 작성해주세요. 이때 결과는 고용일자를 기준으로 내림차순 정렬하고, 고용일자가 같다면 이름을 기준으로 오름차순 정렬해주세요.
SELECT dr_name, dr_id, mcdp_cd, date_format(hire_ymd, "%Y-%m-%d") from doctor where mcdp_cd in('CS', 'GS') order by hire_ymd desc, dr_name;

-- 12세 이하인 여자 환자 목록 출력하기
-- PATIENT 테이블에서 12세 이하인 여자환자의 환자이름, 환자번호, 성별코드, 나이, 전화번호를 조회하는 SQL문을 작성해주세요. 이때 전화번호가 없는 경우, 'NONE'으로 출력시켜 주시고 결과는 나이를 기준으로 내림차순 정렬하고, 나이 같다면 환자이름을 기준으로 오름차순 정렬해주세요.
SELECT pt_name, pt_no, gend_cd, age, ifnull(tlno, 'NONE') from patient where gend_cd = 'W' and age <= 12 order by age desc, pt_name;

-- 인기있는 아이스크림
-- 상반기에 판매된 아이스크림의 맛을 총주문량을 기준으로 내림차순 정렬하고 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하여 조회하는 SQL 문을 작성해주세요.
SELECT flavor from first_half order by total_order desc, shipment_id;

-- 조건에 맞는 도서 리스트 출력하기
-- BOOK 테이블에서 2021년에 출판된 '인문' 카테고리에 속하는 도서 리스트를 찾아서 도서 ID(BOOK_ID), 출판일 (PUBLISHED_DATE)을 출력하는 SQL문을 작성해주세요.
-- 결과는 출판일을 기준으로 오름차순 정렬해주세요.
SELECT book_id, date_format(published_date, '%Y-%m-%d') from book where published_date like '2021-%' and category = '인문' order by published_date;

-- 모든 레코드 조회하기
-- 동물 보호소에 들어온 모든 동물의 정보를 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.
SELECT * from animal_ins order by animal_id;

-- 평균 일일 대여 요금 구하기
-- CAR_RENTAL_COMPANY_CAR 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요. 이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정해주세요.
SELECT round(avg(daily_fee), 0) as 'AVERAGE_FEE' from car_rental_company_car where car_type = 'SUV';

-- 과일로 만든 아이스크림 고르기
-- 상반기 아이스크림 총주문량이 3,000보다 높으면서 아이스크림의 주 성분이 과일인 아이스크림의 맛을 총주문량이 큰 순서대로 조회하는 SQL 문을 작성해주세요.
SELECT f.flavor from first_half f
join icecream_info i on f.flavor = i.flavor
where f.total_order > 3000 and
i.ingredient_type = 'fruit_based'
order by total_order desc;

-- 조건에 부합하는 중고거래 댓글 조회하기
-- USED_GOODS_BOARD와 USED_GOODS_REPLY 테이블에서 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회하는 SQL문을 작성해주세요. 결과는 댓글 작성일을 기준으로 오름차순 정렬해주시고, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬해주세요.
SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, date_format(r.created_date, '%Y-%m-%d') from used_goods_board b 
join used_goods_reply r on b.board_id = r.board_id
where b.created_date like '2022-10-%'
order by r.created_date, b.title;