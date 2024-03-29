SELECT A.ANIMAL_ID ANIMAL_ID, A.ANIMAL_TYPE ANIMAL_TYPE, A.NAME NAME
  FROM ANIMAL_INS A, ANIMAL_OUTS B
 WHERE A.ANIMAL_ID = B.ANIMAL_ID
   AND A.SEX_UPON_INTAKE LIKE '%Intact%' 
   AND (B.SEX_UPON_OUTCOME LIKE '%Spayed%' OR B.SEX_UPON_OUTCOME LIKE '%Neutered%')
 ORDER BY 1;