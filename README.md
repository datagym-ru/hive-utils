# Hive Utils UDF

## Compile

```
mvn compile
```

## Build
```
mvn assembly:single
```

## Run

```
%> hive
hive> ADD JAR hdfs://<hive_metastore>:8020/etc/sparkjars/hive-utils.jar;
hive> create temporary function decode_url as 'com.ermakovpetr.urdldecoder.UrlDecoderUDF';
hive> select decode_url('https%3A%2F%2Flamoda.ru');
```
