**인기 품목 조회**
----
인기 품목을 json 배열로 반환

* **URL**

  `/api/clothes/hot`

* **Method:**

  `GET`

* **Success Response:**

    * **Code:** 200 <br />
      **Content:** <br/>
      ```json
      [
        {
          "id": 1,
          "brand": "NIKE",
          "maker": "ABCmart",
          "name": "jordan",
          "price": 43000,
          "category": "shoes",
          "mainImg": "/test/main1.jpeg",
          "detail": "/test/detail1.jpeg",
          "link": null
        },
        {
          "id": 2,
          "brand": "NIKE",
          "maker": "musinsa",
          "name": "terrex",
          "price": 21000,
          "category": null,
          "mainImg": "/test/main2.jpeg",
          "detail": "/test/detail2.jpeg",
          "link": null
        },
        {
          "id": 3,
          "brand": "ADIDAS",
          "maker": "naver",
          "name": "superstar",
          "price": 34000,
          "category": null,
          "mainImg": "/test/main3.jpeg",
          "detail": "/test/detail3.jpeg",
          "link": null
        }
      ]
      ```