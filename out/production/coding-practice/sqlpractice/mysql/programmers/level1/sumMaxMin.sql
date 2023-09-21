-- 가장 비싼 상품 구하기
-- PRODUCT 테이블에서 판매 중인 상품 중 가장 높은 판매가를 출력하는 SQL문을 작성해주세요. 이때 컬럼명은 MAX_PRICE로 지정해주세요.
SELECT max(price) as 'MAX_PRICE' from product;

-- 최댓값 구하기
-- 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT max(datetime) from animal_ins;