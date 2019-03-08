set hive.exec.dynamic.partition=true;
set hive.exec.dynamic.partition.mode=nonstrict;

-- TODO: [Task 2] Create the partitioned tables
DROP TABLE domainPartitioned;
DROP TABLE trafficPartitioned;

CREATE TABLE domainPartitioned(url STRING)
PARTITIONED BY(category STRING);

INSERT OVERWRITE TABLE domainPartitioned PARTITION(category)
SELECT url, category FROM mydomains;

CREATE TABLE trafficPartitioned(ipaddress STRING, time timestamp)
PARTITIONED BY(url STRING);

INSERT OVERWRITE TABLE trafficPartitioned PARTITION(url)
SELECT ipaddress,ipaddress,url FROM mytraffic;

