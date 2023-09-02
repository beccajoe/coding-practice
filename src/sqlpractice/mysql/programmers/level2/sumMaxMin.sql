-- 동물 수 구하기
-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT count(animal_id) from animal_ins;

-- 최솟값 구하기
-- 동물 보호소에 가장 먼저 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT datetime from animal_ins order by datetime limit 1;