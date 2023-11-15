**품목 신규 생성**
----
새로운 품목을 생성하고 생성된 정보를 json으로 반환

* **URL**

  `/api/clothes`

* **Method:**

  `POST`

* **Request Body** <br/>
  **Required:** <br/>
  ```json
  {
    "brand" : "NIKE",
    "maker" : "abc",
    "name" : "jordan",
    "price" : 200000,
    "category" : "shoes",
    "mainImg" : "NIKE",
    "detail" : "/detail/link"
  }
  ```

* **Success Response:**

    * **Code:** 201 <br />
      **Content:** <br/>
      ```json
      {
        "id": 4,
        "brand": "NIKE",
        "maker": "abc",
        "name": "jordan",
        "price": 200000,
        "category": "shoes",
        "mainImg": "NIKE",
        "detail": "/detail/link",
        "link": null
      }
      ```