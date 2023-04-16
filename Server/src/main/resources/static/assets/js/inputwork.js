let helmetData;
let workerData;
let deletWork;
let roadData;
function work_Instruct()

{

    let userData;
    var helmetId = document.getElementById("helmet_id").value;
    var userId =document.getElementById("userNumber").value;
    //var real_using;
    //let po_int;
    //let pointer;
     
  axios.post(" http://220.81.42.179:8080/api/worker",
              {
        helmetId:helmetId,
        userId:userId
    });
               
    alert(helmetId+" 헬멧에 " + userId + " 노동자 등록 완료.");
    window.location.reload();
     
    /*
    else if(po_int==-1)
        {
            alert("작업지시 실패!! " +"\n (" + helmetId +" 헬멧이 사용중입니다. \n Error: "+"real_using )");
        }
    else if(po_int==-2)
        {
            alert("작업지시 실패!! " +"\n ( 노동자 " + userNumber +" 가 작업중 입니다. \n Error: "+"real_using )");
        }
        */
}

function work_load()
{
    axios.get
    ("http://220.81.42.179:8080/api/helmet")
        .then(function (response) {
            helmetData=response.data;
            console.log(response.data);
        })
        .catch(function (error){

            console.log(error);
        });
    axios.get
    ("http://220.81.42.179:8080/api/user/findAll")
    .then(function (response) {
        workerData=response.data;
        console.log(response.data);
    })
    .catch(function (error){

        console.log(error);
    });
      axios.get
                ("http://220.81.42.179:8080/api/worker")
                    .then(function (response) {
                        roadData=response.data;
                        console.log(response.data);
                    })
                    .catch(function (error){

                        console.log(error);
                    });
    var select_work = document.getElementById('works');
    for(let i = 0; i < roadData.length; i++)
        {
            // <option value='apple'>작업작업</option> 
             let select_list = 
                `<option value='${roadData[i].user_id}'>
        ${roadData[i].helmet_id} & ${roadData[i].user_id}
    </option>`
              select_work.innerHTML += select_list;
        }
}

function work_selected()
{
    var sel_list = document.getElementById('works');
	var index = sel_list.selectedIndex;
	deletWork = sel_list.options[index].value;
	var text = sel_list.options[index].text;
	console.log( 'index=', index, 'value=', deletWork, 'text=', text );
}

function work_Delete() {
    let userId = deletWork;
    console.log( "helmetId" + userId );
    console.log( "deletWork" + deletWork );
    if (userId == null)
        {
            alert("삭제할 작업이 선택되지 않았습니다.");
        }
    else{
     axios.get("http://220.81.42.179:8080/api/worker/delete/" + userId);

     alert("작업자 번호 " + userId + "와 연동된 헬멧 작업 취소 완료");
    window.location.reload();
    }
}









