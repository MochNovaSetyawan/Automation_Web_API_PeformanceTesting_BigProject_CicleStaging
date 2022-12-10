Feature: User Post
  Background:
    * url 'https://stagingapi.cicle.app/api/v1'
    * def tokenID = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYzNjYzOTMxM2U3Y2NmYTYzNzA4ZDlmYiIsImdvb2dsZUlkIjoiMTEwMjMyMDY2MjM2MTQwOTczMjc4IiwiZW1haWwiOiJ0ZXN0aW5nbm92YTIwMDBAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJUZXN0IE5vdmEiLCJwaG90b1VybCI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FMbTV3dTBJc3RLUWtIQjJqYUVmY1pocm1PQmpMY0pYQkRNYkFYam5aa3lJPXM5Ni1jIiwiYmlvIjoiIiwic3RhdHVzIjoiIiwiZGVmYXVsdENvbXBhbnkiOnsiX2lkIjoiNjFlYmEyYzg1MDgwZjQ3YjI1ZGRjOGY4In0sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDVUMTA6MjE6MzcuMjk0WiIsInVwZGF0ZWRBdCI6IjIwMjItMTEtMDVUMTA6MjI6MjcuODA5WiIsIl9fdiI6MH0sImlhdCI6MTY2NzY1MzQzMCwiZXhwIjoxNjcwMjQ1NDMwfQ.1eiYiHatGUVXJMTbFuLrwmaiaeJYQPwtw_4DWRq7AQU'

  Scenario: Get by ID
    Given path '/posts/636fa20e2b70f216bee13514'
    And header Authorization = 'jwt' +' '+ tokenID
    When method GET
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  Scenario: Edit complete
    * header Accept = 'application/json'
    Given path '/posts/636663ef75609f4a3eaf10f3/complete'
    And header Authorization = 'jwt' +' '+ tokenID
    And request read('1_posts.json')
    When method PATCH
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  Scenario: Create comment
    * header Accept = 'application/json'
    Given path '/posts/636fa7142b70f216bee13ea5/comments'
    And header Authorization = 'jwt' +' '+ tokenID
    And request read('2_posts.json')
    When method POST
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies