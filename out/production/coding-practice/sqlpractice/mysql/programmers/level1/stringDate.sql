-- 특정 옵션이 포함된 자동차 리스트 구하기
-- CAR_RENTAL_COMPANY_CAR 테이블에서 '네비게이션' 옵션이 포함된 자동차 리스트를 출력하는 SQL문을 작성해주세요. 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.
SELECT car_id, car_type, daily_fee, options from car_rental_company_car where options like '%네비게이션%' order by car_id desc;

-- 자동차 대여 기록에서 장기/단기 대여 구분하기
-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여 대여기록을 출력하는 SQL문을 작성해주세요. 결과는 대여 기록 ID를 기준으로 내림차순 정렬해주세요.
SELECT history_id, car_id, date_format(start_date, '%Y-%m-%d') as 'start_date', date_format(end_date, '%Y-%m-%d') as end_date,
case 
    when datediff(end_date, start_date) + 1 > 30 then '장기 대여'
    when datediff(end_date, start_date) + 1 = 30 then '장기 대여'
    when datediff(end_date, start_date) + 1 < 30 then '단기 대여'
end as rent_type
from car_rental_company_rental_history 
where start_date like '2022-09-%' 
order by history_id desc;