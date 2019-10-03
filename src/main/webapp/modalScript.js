let state = {};

// Get the modal
var modal = document.getElementById("myModal");



// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

var plusHomeTeamGoal = document.getElementById("plusHomeTeamGoal");
plusHomeTeamGoal.onclick = function() {
	state.homeTeamGoal = true;
    modal.style.display = "block";
    let playerSelect = document.getElementById("playerSelect");
    playerSelect.innerHTML = '';
    for(index in window.gameData.firstTeam.players) {
       let player = window.gameData.firstTeam.players[index];
       var opt = document.createElement("option");
       opt.value= player.id;
       opt.innerHTML = player.firstName + ' ' + player.lastName;
       playerSelect.appendChild(opt);
    }
}
var plusGuestTeamGoal = document.getElementById("plusGuestTeamGoal");
plusGuestTeamGoal.onclick = function() {
	state.homeTeamGoal = false;
    modal.style.display = "block";
    let playerSelect = document.getElementById("playerSelect");
        playerSelect.innerHTML = '';
        for(index in window.gameData.secondTeam.players) {
           let player = window.gameData.secondTeam.players[index];
           var opt = document.createElement("option");
           opt.value= player.id;
           opt.innerHTML = player.firstName + ' ' + player.lastName;
           playerSelect.appendChild(opt);
        }
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

//modal2
var goalModal = document.getElementById("goalModal");

var gbtn = document.getElementById("goalBtn");

goalBtn.onclick = function() {
    myModal.style.display = "block";
}

var span2 = document.getElementsByClassName("close")/*[1]*/;

span2.onclick = function() {
    goalModal.style.display = "none";
}
window.onclick = function(event) {
    if (event.target == goalModal) {
        goalModal.style.display = "none";
    }
}
function addGoalBtnClicked(event) {
    let goalMinute = document.getElementById("goalMinute");
    let playerSelect = document.getElementById("playerSelect");
    console.log('addGoalBtnClicked', playerSelect.value, goalMinute.value);
//    POST /games/4/goal?playerId=2&minute=33&homeTeamGoal=true;
    let params = '?playerId=' + playerSelect.value + '&goalMinute=' + goalMinute.value + "&homeTeamGoal=" + state.homeTeamGoal;
    let apiUrl = '/api/game/' + id + '/goal/' + params;
    fetch(apiUrl, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        }
    }).then(function(response) {
        console.log(response);
        if(response.ok) {
            document.getElementById('myModal').style.display = "none";
            location.pathname = location.pathname;
        } else {
            document.getElementById('myModal').style.display = "none";
            alert('Error');
        }
        return  response.json();
    }).then(function(data) {
        console.log(data);
    })
}

function deleteGoal(gameId, goalId, homeTeamGoal) {
    console.log('deleteGoal', goalId)
    let apiUrl = '/api/game/' + gameId + '/goal/' + goalId + '?isHomeTeamGoal=' + homeTeamGoal;
    fetch(apiUrl, {
        method: 'DELETE',
        headers: {
          'Content-Type': 'application/json',
        }
    }).then(function(response) {
        console.log(response);
        if(response.ok) {
            location.pathname = location.pathname;
        } else {
            alert('Error');
        }
        return  response.json();
    }).then(function(data) {
    })
}

var checkbox = document.querySelector("input[name=match-over]");
console.log(checkbox);

checkbox.addEventListener( 'change', function(checked) {
    if(this.checked) {
        console.log('checked');
    } else {
        console.log('unchecked');
    }

    let apiUrl = '/api/game/' + id + '/completed/' + this.checked;
        fetch(apiUrl, {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json',
            }
        }).then(function(response) {
            console.log(response);
            if(response.ok) {
            } else {
                alert('Error');
            }
        })

});