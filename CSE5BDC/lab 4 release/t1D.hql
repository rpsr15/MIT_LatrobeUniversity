DROP TABLE trafficCount;
CREATE TABLE trafficCount AS
SELECT URL AS URL ,COUNT(URL) AS COUNT FROM mytraffic group by URL ORDER BY 2 DESC;


INSERT OVERWRITE LOCAL DIRECTORY './task1d-out/'
ROW FORMAT DELIMITED
  FIELDS TERMINATED BY '\t'
STORED AS TEXTFILE
SELECT   mydomains.category, sum(trafficCount.COUNT) as count
FROM trafficCount INNER JOIN mydomains where trafficCount.URL = mydomains.url group by mydomains.category order by count desc;

SELECT   *
FROM mytraffic INNER JOIN mydomains where mytraffic.URL = mydomains.url;
 group by mydomains.category order by count desc;



