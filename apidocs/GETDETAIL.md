**품목 상세 조회**
----
품목 상세 정보를 json 으로 반환

* **URL**

  `/api/clothes/detail/:clotheId`

* **Method:**

  `GET`

* **Success Response:**

    * **Code:** 200 <br />
      **Content:** <br/>
      ```json
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
      ```