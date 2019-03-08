DROP TABLE mydomains;
DROP TABLE myips;
DROP TABLE myregions;
DROP TABLE mytraffic;
CREATE TABLE mydomains (url STRING, category STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INPATH './Input_data/1/domains.csv'
INTO TABLE mydomains;

-- TODO: [Task 1A] Load the other data files into tables
CREATE TABLE myips (ipAddress STRING, intAddress BIGINT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INPATH './Input_data/1/ips.csv'
INTO TABLE myips;

CREATE TABLE myregions (ipMin STRING,ipMax STRING, intMin BIGINT, intMax BIGINT, regionCode STRING,regionName STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INPATH './Input_data/1/regions.csv'
INTO TABLE myregions;

CREATE TABLE mytraffic (URL STRING, ipAddress STRING, time TIMESTAMP)
ROW FORMAT DELIMITED FIELDS TERMINATED BY ',';
LOAD DATA LOCAL INPATH './Input_data/1/traffic.csv'
INTO TABLE mytraffic;
