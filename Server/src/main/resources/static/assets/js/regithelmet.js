function regit_Helmet_Inf() {

    var helmetId = document.getElementById("helmet_id").value;
    
     var helmetModelName = document.getElementById("helmet_name").value;

    var helmetMakeDate = document.getElementById("helmet_make_date").value;
    
    var helmetBuyDate = document.getElementById("helmet_buy_date").value;
    
    var helmetPrice = document.getElementById("helmet_price").value;
    
   
   axios.post("http://220.81.42.179:8080/api/helmet/registrationr",
              {
                  helmetId:helmetId,
                  helmetModelName:helmetModelName,
                  helmetMakeDate:helmetMakeDate,
                  helmetBuyDate:helmetBuyDate,
                  helmetPrice:helmetPrice
        
        
        
    });
    
    // log
    console.log("helmet_id = " + helmetId);
    console.log("helmet_name = " + helmetModelName);
    console.log("helmet_make_date = " + helmetMakeDate);
    console.log("helmet_buy_date = " + helmetBuyDate);
    console.log("helmet_price = " + helmetPrice);
    console.log('헬멧 등록 완료');
    showPopUp(helmetId,helmetModelName);
    

}

function showPopUp(message,message2)
{
    alert("헬멧ID :" + message + 
          "  헬멧모델명 : "+ message2 +
                    " 등록 완료. ");

}