# 1. Introducción

# 2. Proceso de transformación

## Selección de fuente de datos

#### Fuente

La fuente de datos elegida ha sido los lugares de interés turistico del OpenData del Ayuntamiento de Bilbao.

URL: https://www.bilbao.eus/opendata/es/catalogo/turismo/formatos/frecuencias/nombre-ascendente

#### Licencia

La licencia de los datos es Creative Commons - Reconocimiento 3.0 España (CC BY 3.0 ES). Los detalles de la misma se 
encuentran en:  https://www.bilbao.eus/opendata/es/licencia-para-conjunto-de-datos

#### Análisis de los datos

Los datos son lugares turisticos de la ciudad de Bilbao. Por cada lugar turistico se sabe lo siguiente:

| DATO | TIPO | DESCARTADO | OBSERVACIONES
| ---------- | ---------- |  ---------- | ---------- | 
| NOMBRE_FAMILIA   | String   | NO | Es un Strng con valores fijos
| NOMBRE_LUGAR_CAS   | String   | NO | Nombre del sitio en Castellano
| NOMBRE_LUGAR_EUS   | String   | NO | Nombre del sitio en Euskera
| COD_CALLE   | Integer   | NO | Codigo relacional a la calle donde esta (otro doc)
| NOMBRE_CALLE   | String   | NO | Nombre de la calle donde esta
| COD_TIPO_VIA   | Integer   | NO | 
| NOMBRE_TIPO_VIA   | Integer   | NO | 
| BLOQUE   | ??   | SI |  No hay valor en la columna
| NUMERO   | INTEGER   | NO | 
| BIS   | CHAR   | NO | Hay muchos valores vacíos
| COORDENADA_UTM_X   | DOUBLE   | NO | 
| COORDENADA_UTM_Y   | DOUBLE   | NO | 


#### Estrategia de nombrado
//TODO

#### Desarrollo del vocabulario
//TODO



#### Proceso de transformación

Para la transformación del fichero .CSV en el formato RDF se ha realizado lo siguiente:

* Comprobación de los datos
* Eliminación de la columna no deseada 
* Reemplazo del caracter , por un espacio
* Reemplazo del caracter ; por el , 
* Se sube el fichero a http://levelup.networkedplanet.com para su transformación.
* Se asignan los tipos de valores y el idioma en caso de ser textos
* Se descarga el resultado

Las herramientas usadas han sido Notepad++ y la pagina web mencionada .

#### ENLAZADO

//TODO

#### Publicación

Actualmente no se publica en ningún sitio pero se va a añadir a la app Knowlii (www.knowlii.com) de la cual soy el CTO al apartado de Bilbao. A su vez se añadira como 
formato OPEN a (https://public.knowlii.com).




# 3. Aplicación y explotación


# 4. Conclusiones


# 5. Bibliografía



