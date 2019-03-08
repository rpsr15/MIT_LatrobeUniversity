INSERT OVERWRITE LOCAL DIRECTORY './task1c-out/'
ROW FORMAT DELIMITED
  FIELDS TERMINATED BY '\t'
STORED AS TEXTFILE
SELECT  * FROM mytraffic WHeRE URL = "www.Facebook.com" AND mytraffic.time BETWEEN  unix_timestamp("2014-02-14 00:00:00") AND unix_timestamp
("2014-02-15 00:00:00") ;
