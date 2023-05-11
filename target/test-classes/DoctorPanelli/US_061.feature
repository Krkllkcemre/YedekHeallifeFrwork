Feature: US_061 As a doctor, I want to access the data of patients who have undergone Pathology tests and view their test results from the Pathology page on the Dashboard Sidebar.


    Scenario: TC_001 When the Pathology link in the Dashboard Sidebar is clicked, it should direct the user to the relevant page.

      Given   Browser açılır ve gerekli "url" gidilir.
      Then   Kullanıcı email ve password bilgileri girilip sing ın butonuna tıklanır.
      Then   Dashboard sidebar'dan "pathology" linkine tıklanır.
      Then    Kullanıcı "pathology" bölüme geldigi dogrulanır
      And     The browser is closed.

