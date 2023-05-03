window.onload=function () {

    fetch('list')
      .then(response => response.json())
      .then(json => processJson(json));

    fetch('list-singer')
      .then(response => response.json())
      .then(json => processJsonSingers(json));

    fetch('list-song')
      .then(response => response.json())
      .then(json => processJsonSongs(json));

};

function processJson(contacts){

    var table = document.getElementById("contacts-list");

    for (var i = 0; i < contacts.length; i++) {

        tr = table.insertRow(-1);
        tr.insertCell(-1).innerHTML=contacts[i].id;
        tr.insertCell(-1).innerHTML=contacts[i].firstName;
        tr.insertCell(-1).innerHTML=contacts[i].lastName;

    }

}


function processJsonSingers(singers){

    var table = document.getElementById("singers-list");

    for (var i = 0; i < singers.length; i++) {

        tr = table.insertRow(-1);
        tr.insertCell(-1).innerHTML=singers[i].id;
        tr.insertCell(-1).innerHTML=singers[i].name;

    }

}

function processJsonSongs(songs){

    var table = document.getElementById("songs-list");

    for (var i = 0; i < songs.length; i++) {

        tr = table.insertRow(-1);
        tr.insertCell(-1).innerHTML=songs[i].id;
        tr.insertCell(-1).innerHTML=songs[i].name;
    }

}
