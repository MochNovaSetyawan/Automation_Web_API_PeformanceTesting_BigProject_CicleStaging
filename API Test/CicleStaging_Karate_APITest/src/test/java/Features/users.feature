Feature: User Profile
  Background:
    * url 'https://stagingapi.cicle.app/api/v1'
    * def tokenID = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7Il9pZCI6IjYzNjYzOTMxM2U3Y2NmYTYzNzA4ZDlmYiIsImdvb2dsZUlkIjoiMTEwMjMyMDY2MjM2MTQwOTczMjc4IiwiZW1haWwiOiJ0ZXN0aW5nbm92YTIwMDBAZ21haWwuY29tIiwiZnVsbE5hbWUiOiJNb2NoIE5vdmEgU2V0eWF3YW4iLCJwaG90b1VybCI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FMbTV3dTBJc3RLUWtIQjJqYUVmY1pocm1PQmpMY0pYQkRNYkFYam5aa3lJPXM5Ni1jIiwiYmlvIjoic3VkYWggZGkgdGFrZGlya2FuIG1haGEgcGVuY2lwdGEiLCJzdGF0dXMiOiJzaW5nbGUgc2VsYW1hbnlhIiwiZGVmYXVsdENvbXBhbnkiOnsiX2lkIjoiNjM4ZDQ4NDQ0YTcyMDVlYjFiMmM1NDRjIn0sImNyZWF0ZWRBdCI6IjIwMjItMTEtMDVUMTA6MjE6MzcuMjk0WiIsInVwZGF0ZWRBdCI6IjIwMjItMTItMDVUMDE6MjQ6MjAuODEzWiIsIl9fdiI6MH0sImlhdCI6MTY3MDQxNTc1MywiZXhwIjoxNjczMDA3NzUzfQ.L_x-D3XspJ-rFB81c2_P4jlhNjetk9h_KGCNyr_4yXo'

  Scenario: Get profile
    Given path '/users/636639313e7ccfa63708d9fb'
    And header Authorization = 'jwt' +' '+ tokenID
    When method GET
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies

  Scenario: Edit profile
    Given path '/users/636639313e7ccfa63708d9fb'
    And header Authorization = 'jwt' +' '+ tokenID
    When method PATCH
    And request {'fullName':'Moch Nova Setyawan','status':'single selamanya','bio':'sudah di takdirkan maha pencipta'}
    Then status 200
    And print response
    And print responseStatus
    And print responseTime
    And print responseHeaders
    And print responseCookies