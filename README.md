# TemperAssignment
*** This is a very weird way of sending over this data!
```
{
   "data":{
      "2018-05-22":[
         {
            "title":"Kookfanaat ",
            "id":7645,
            "key":"8ezrz9",
            "date":{
               "date":"2018-05-22 15:00:00.000000",
               "timezone_type":3,
               "timezone":"Europe\/Amsterdam"
            },
            "location":{
               "lat":"52.391824",
               "lng":"5.735021"
            },
            "distance":52,
            "url":"https:\/\/temper.works\/werken-bij\/resort-veluwemeer-exploitatie-b-v\/zelfstandig-werkend-kok\/kookfanaat-1",
            "max_possible_earnings_hour":25.5,
            "max_possible_earnings_total":153,
            "client":{
               "name":"Resort Veluwemeer ",
               "id":"8r7v9q",
               "rating":{
                  "average":4.666666666666667,
                  "count":12
               },
               "photos":[
                  {
                     "id":43321,
                     "owned_by_id":3268,
                     "owned_by_type":"App\\Client",
                     "filetype":"image\/png",
                     "created_at":"2018-03-26 14:11:09",
                     "updated_at":"2018-03-26 14:11:10",
                     "formats":[
                        {
                           "id":74163,
                           "photo_id":43321,
                           "format":"hero",
                           "cdn_url":"https:\/\/3c84b9d8b8455576d016-ec26f1e225c7d8773d30eb671f4351ea.ssl.cf3.rackcdn.com\/hero\/43321-5ab8e36045a26.jpg",
                           "created_at":"2018-03-26 14:11:11",
                           "updated_at":"2018-03-26 14:11:13"
                        }
                     ]
                  }
               ],
               "description":"\r\nFriends \u2019n Bites, de nieuwe restaurant filosofie van EuroParcs, gaat grenzen verleggen. Het wordt d\u00e9 ontmoetingsplaats van Nunspeet bij uitstek. En met maar een doel: puur en intens samen genieten van de hoogstaande kookkunsten die hier zullen aangeboden worden. En dit in een perfect entourage en een eigentijdse sfeer!\r\n\r\n\r\n\r\n\r\nEen verrassende uitstraling!\r\n Entourage en sfeer van Friends 'n Bites in Nunspeet is niet in \u00e9\u00e9n woord te vatten! Het staat bol van emotie... Het trendy Restaurant annex Grand Caf\u00e9 met een ruw randje is d\u00e9 ontmoetingsplaats bij uitstek! De plaats waar je nieuwe en oude vrienden ontmoet... en puur en intens samen kunt genieten. Zien en gezien worden....maar vooral gezellig!\r\n\r\nOriginal Kitchen\r\n De keuken van Friends 'n Bites neemt je mee terug naar de voeding zoals onze verre voorvaderen die ook gegeten hebben. Je zintuigen worden geprikkeld bij het nuttigen van vers bereid eten, met als basis verse producten van hoge kwaliteit. Met een verrassende smaaksensatie als gevolg...een onvergetelijke ervaring!\r\n\r\nGrand Caf\u00e9\r\n Lekker borrelen met uw gezelschap of op het terras een hapje en een drankje nuttigen terwijl uw kinderen zich vermaken in de speeltijd? We zijn u graag in ons Grand Caf\u00e9! Het Grand Caf\u00e9 is vanaf 1 mei 2016 geopend. \r\n",
               "avg_response_time_in_hours":5
            },
            "job_category":{
               "description":"Zelfstandig Werkend Kok",
               "icon_path":"\/assets\/img\/icon-category-zelfstandig-werkend-kok.svg",
               "slug":"zelfstandig-werkend-kok"
            },
            "open_positions":1,
            "new_matches_count":0,
            "shifts":[
               {
                  "tempers_needed":1,
                  "earnings_per_hour":25.5,
                  "duration":6,
                  "currency":"EUR",
                  "start_date":"2018-05-22",
                  "start_time":"15:00",
                  "start_datetime":"2018-05-22 15:00:00",
                  "end_time":"21:00",
                  "end_datetime":"2018-05-22 21:00:00",
                  "is_auto_accepted_when_applied_for":0
               }
            ]
         },
         ...
      ]
   }
}
```

Instead, simplify a dev's life by doing this.

```
[
   {
      "date":"2018-05-22",
      "jobs":[
         {
            "title":"Kookfanaat ",
            "id":7645,
            "key":"8ezrz9",
            "date":{
               "date":"2018-05-22 15:00:00.000000",
               "timezone_type":3,
               "timezone":"Europe\/Amsterdam"
            },
            "location":{
               "lat":"52.391824",
               "lng":"5.735021"
            },
            "distance":52,
            "url":"https:\/\/temper.works\/werken-bij\/resort-veluwemeer-exploitatie-b-v\/zelfstandig-werkend-kok\/kookfanaat-1",
            "max_possible_earnings_hour":25.5,
            "max_possible_earnings_total":153,
            "client":{
               "name":"Resort Veluwemeer ",
               "id":"8r7v9q",
               "rating":{
                  "average":4.666666666666667,
                  "count":12
               },
               "photos":[
                  {
                     "id":43321,
                     "owned_by_id":3268,
                     "owned_by_type":"App\\Client",
                     "filetype":"image\/png",
                     "created_at":"2018-03-26 14:11:09",
                     "updated_at":"2018-03-26 14:11:10",
                     "formats":[
                        {
                           "id":74163,
                           "photo_id":43321,
                           "format":"hero",
                           "cdn_url":"https:\/\/3c84b9d8b8455576d016-ec26f1e225c7d8773d30eb671f4351ea.ssl.cf3.rackcdn.com\/hero\/43321-5ab8e36045a26.jpg",
                           "created_at":"2018-03-26 14:11:11",
                           "updated_at":"2018-03-26 14:11:13"
                        }
                     ]
                  }
               ],
               "description":"\r\nFriends \u2019n Bites, de nieuwe restaurant filosofie van EuroParcs, gaat grenzen verleggen. Het wordt d\u00e9 ontmoetingsplaats van Nunspeet bij uitstek. En met maar een doel: puur en intens samen genieten van de hoogstaande kookkunsten die hier zullen aangeboden worden. En dit in een perfect entourage en een eigentijdse sfeer!\r\n\r\n\r\n\r\n\r\nEen verrassende uitstraling!\r\n Entourage en sfeer van Friends 'n Bites in Nunspeet is niet in \u00e9\u00e9n woord te vatten! Het staat bol van emotie... Het trendy Restaurant annex Grand Caf\u00e9 met een ruw randje is d\u00e9 ontmoetingsplaats bij uitstek! De plaats waar je nieuwe en oude vrienden ontmoet... en puur en intens samen kunt genieten. Zien en gezien worden....maar vooral gezellig!\r\n\r\nOriginal Kitchen\r\n De keuken van Friends 'n Bites neemt je mee terug naar de voeding zoals onze verre voorvaderen die ook gegeten hebben. Je zintuigen worden geprikkeld bij het nuttigen van vers bereid eten, met als basis verse producten van hoge kwaliteit. Met een verrassende smaaksensatie als gevolg...een onvergetelijke ervaring!\r\n\r\nGrand Caf\u00e9\r\n Lekker borrelen met uw gezelschap of op het terras een hapje en een drankje nuttigen terwijl uw kinderen zich vermaken in de speeltijd? We zijn u graag in ons Grand Caf\u00e9! Het Grand Caf\u00e9 is vanaf 1 mei 2016 geopend. \r\n",
               "avg_response_time_in_hours":5
            },
            "job_category":{
               "description":"Zelfstandig Werkend Kok",
               "icon_path":"\/assets\/img\/icon-category-zelfstandig-werkend-kok.svg",
               "slug":"zelfstandig-werkend-kok"
            },
            "open_positions":1,
            "new_matches_count":0,
            "shifts":[
               {
                  "tempers_needed":1,
                  "earnings_per_hour":25.5,
                  "duration":6,
                  "currency":"EUR",
                  "start_date":"2018-05-22",
                  "start_time":"15:00",
                  "start_datetime":"2018-05-22 15:00:00",
                  "end_time":"21:00",
                  "end_datetime":"2018-05-22 21:00:00",
                  "is_auto_accepted_when_applied_for":0
               },
               ...
            ]
         }
      ]
   },
   ...
]
```
