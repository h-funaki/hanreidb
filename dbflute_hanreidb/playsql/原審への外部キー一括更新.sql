-- update sql

update JUDGEMENT j1, 
(select rel1.judgement_id as 'original_pk', cj2_2.judgement_id as 'this_pk'
from COURT_JUDGEMENT cj1 inner join JUDGEMENT_SOURCE_REL rel1 on rel1.judgement_source_id = cj1.source_original_id
inner join
 (select rel2.judgement_id, original_case_number,original_court_name from COURT_JUDGEMENT cj2_1 inner join JUDGEMENT_SOURCE_REL rel2 on rel2.judgement_source_id = cj2_1.source_original_id
 where original_case_number is not null and original_court_name is not null) as cj2_2
 on cj1.case_number = cj2_2.original_case_number and cj1.court_name = cj2_2.original_court_name) as j2
 
 set j1.original_judgement_id = j2.original_pk, j1.update_datetime = now(), j1.update_user = '原審への外部キー更新'
 where j1.judgement_id = j2.this_pk
 ;

-- 検証
select * from JUDGEMENT where original_judgement_id is not null;