function makeMap(mylat, mylong) {
		if (document.getElementById("map")) {
			document.getElementById("map").innerHTML = "<iframe style=\"width: 800px; height: 800px\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"//maps.google.com/?ll=" + mylat + "," + mylong + "&z=16&output=embed\"></iframe>"; 
		}
	}

           
           
 function Location_Inf()
            {
                window.open("http://220.81.42.179:8080/map.html");
                 //makeMap(location_inf_latitude,location_inf_longitude);
                
            }

function Search_map()
{
    let user_latitude = (document.getElementById("latitude").value)
    let user_logitude = (document.getElementById("longitude").value);
    makeMap(user_latitude,user_logitude);
}