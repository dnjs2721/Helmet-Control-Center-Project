function regit_User_Inf() {

    var userName = document.getElementById("userName").value;
    
     var userSsn = (document.getElementById("userSsn1").value)+
         (document.getElementById("userSsn2").value);

    var userBirth = document.getElementById("userBirth").value;
    
    var userPhoneNumber = document.getElementById("userPhoneNumber").value;
    
    var userBloodType = document.getElementById("userBloodType").value;
    
    var userWorkLocation = document.getElementById("userWorkLocation").value;
    
   
   axios.post("http://220.81.42.179:8080/api/user",
              {
        userName:userName,
        userSsn:userSsn,
        userBirth:userBirth,
        userPhoneNumber:userPhoneNumber,
        userBloodType:userBloodType,
        userWorkLocation:userWorkLocation
        
        
    });
    
    // log
    console.log("userName = " + userName);
    console.log("userSsn = " + userSsn);
    console.log("userBirth = " + userBirth);
    console.log("userPhoneNumber = " + userPhoneNumber);
    console.log("userBloodType = " + userBloodType);
    console.log("userWorkLocation = "+userWorkLocation);
    console.log('사용자 등록 완료');
    showPopUp(userName);
    

}

function showPopUp(message)
{
    alert("사용자 " + message + " 등록 완료. ");

}