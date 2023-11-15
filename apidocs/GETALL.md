**모든 품목 조회**
----
모든 품목을 페이지네이션해서 조회.<br/>
페이지 당 품목 10개.<br/>
페이지 미지정시 기본 첫 페이지.

* **URL**

  `/api/clothes/all`

* **Method:**

  `GET`

*  **URL Params**

   **Optional:**
   `page=[integer]`

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