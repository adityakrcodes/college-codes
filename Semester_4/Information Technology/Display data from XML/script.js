function displayStudentInfo() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        // Access the elements and their values in the XML document
        var xmlDoc = this.responseXML;
        var name = xmlDoc.getElementsByTagName("name")[0].childNodes[0].nodeValue;
        var id = xmlDoc.getElementsByTagName("id")[0].childNodes[0].nodeValue;
        var major = xmlDoc.getElementsByTagName("major")[0].childNodes[0].nodeValue;
        var enrollment_date = xmlDoc.getElementsByTagName("enrollment_date")[0].childNodes[0].nodeValue;
        var courses = xmlDoc.getElementsByTagName("course");
        var coursesHtml = "<ul>";
        for (var i = 0; i < courses.length; i++) {
          var code = courses[i].getElementsByTagName("code")[0].childNodes[0].nodeValue;
          var name = courses[i].getElementsByTagName("name")[0].childNodes[0].nodeValue;
          var grade = courses[i].getElementsByTagName("grade")[0].childNodes[0].nodeValue;
          coursesHtml += "<li>" + code + " - " + name + " (" + grade + ")</li>";
        }
        coursesHtml += "</ul>";
        
        document.getElementById("name").innerHTML = name;
        document.getElementById("id").innerHTML = id;
        document.getElementById("major").innerHTML = major;
        document.getElementById("enrollment_date").innerHTML = enrollment_date;
        document.getElementById("courses").innerHTML = coursesHtml;
      }
    };
    xhttp.open("GET", "student.xml", true);
    xhttp.send();
  }