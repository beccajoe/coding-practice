-- 이름이 있는 동물의 아이디
-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.
SELECT animal_id from animal_ins where name is not null order by animal_id asc;

-- 나이 정보가 없는 회원 수 구하기
-- USER_INFO 테이블에서 나이 정보가 없는 회원이 몇 명인지 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 USERS로 지정해주세요.
SELECT count(user_id) as 'USERS' from user_info where age is null;

-- 경기도에 위치한 식품창고 목록 출력하기
-- FOOD_WAREHOUSE 테이블에서 경기도에 위치한 창고의 ID, 이름, 주소, 냉동시설 여부를 조회하는 SQL문을 작성해주세요. 이때 냉동시설 여부가 NULL인 경우, 'N'으로 출력시켜 주시고 결과는 창고 ID를 기준으로 오름차순 정렬해주세요.
SELECT warehouse_id, warehouse_name, address, ifnull(freezer_yn, 'N') from food_warehouse where address like '경기도%' order by warehouse_id;

-- 이름이 없는 동물의 아이디
-- 동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성해주세요. 단, ID는 오름차순 정렬되어야 합니다.
SELECT animal_id from animal_ins where name is null order by animal_id;