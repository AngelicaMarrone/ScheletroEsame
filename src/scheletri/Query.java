//Selezionare tutti gli eventi criminosi in un determinato distretto in quel determinato anno
"SELECT * FROM EVENTS WHERE is_crime=1 AND district_id=? AND YEAR(reported_date)=?"

//Selezionare tutti gli eventi NON CRIMINOSI in un determinato distretto in quel determinato anno
"SELECT * FROM EVENTS WHERE is_crime=0 AND district_id=? AND YEAR(reported_date)=?"

//Selezionare i vari distretti con la relativa posizione media (Lat,Lon) dei crimini avvenuti in quell'anno
"SELECT DISTINCT district_id, AVG(geo_lon) AS avgLon, AVG(geo_lat) AS avgLat FROM events WHERE YEAR(reported_date)=? GROUP BY district_id"

//Selezionare tutti i tipi di crimini effettuati in quell'anno e in quel distretto
"SELECT DISTINCT offense_type_id FROM EVENTS WHERE YEAR(reported_date)=? AND district_id=?"

//Selezionare i tutti i vari tipi di crimini con la relativa posizione media (Lat,Lon) avvenuti in quell'anno
"SELECT DISTINCT offense_type_id, AVG(geo_lon) AS avgLon, AVG(geo_lat) AS avgLat FROM events WHERE YEAR(reported_date)=? GROUP BY offense_type_id"

//Selezionare numero di crimini totali commessi in quell'anno per ogni distretto
"SELECT district_id AS id, COUNT(*) AS cnt FROM EVENTS WHERE YEAR(reported_date)=? AND is_crime=1 GROUP BY district_id"

//Selezionare tutti gli eventi riportati in quell'anno, quel mese e quel giorno
"SELECT * FROM events WHERE Year(reported_date)=? AND Month(reported_date)=? AND Day(reported_date)=?"

//Selezionare diversi tipi di eventi criminosi
"SELECT DISTINCT e.offense_type_id FROM events e WHERE e.is_crime = 1" ;

//Selezionare diversi tipi di eventi criminosi nell'anno x
"SELECT DISTINCT e.offense_type_id FROM events e WHERE e.is_crime = 1 AND year(e.reported_date) = ?";

//Selezionare distinct offense_code di eventi criminosi
"SELECT DISTINCT e.offense_code FROM EVENTS e WHERE e.is_crime = 1";

//Selezionare distinct precinct_id di eventi criminosi
"SELECT DISTINCT e.precinct_id FROM events e WHERE e.is_crime = 1";

//Selezionare distinct neighborhood_id di eventi criminosi
"SELECT DISTINCT e.neighborhood_id FROM events e WHERE e.is_crime = 1";

