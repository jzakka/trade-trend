**품목 정보 수정**
----
품목 정보를 수정하고 수정된 품목 정보를 json으로 반환

* **URL**

  `/api/clothes/:clotheId`

* **Method:**

  `PATCH`

* **Request Body**
  **Required:** <br/>
  ```json
  {
    "name" : "nike-terrex",
    "brand" : "nike-acg"
  }
  ```

* **Success Response:**

    * **Code:** 200 <br />
      **Content:** <br/>
      ```json
      {
        "id": 2,
        "brand": "nike-acg",
        "maker": "musinsa",
        "name": "nike-terrex",
        "price": 21000,
        "category": null,
        "mainImg": "/test/main2.jpeg",
        "detail": "/test/detail2.jpeg",
        "link": null
      }
      ```