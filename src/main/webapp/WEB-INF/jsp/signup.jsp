<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Реєстрація</title>
    <link rel="stylesheet" href="style.css">
    <link rel="shortcut icon" href="img/footgo-dark-icon.png" type="image/x-icon">


</head>
<body>
<header>
    <div class="header-full">
        <div class="header-first-block">
            <div class="header-icon">
                <a href="/"><img class="header-img" src="img/footgo-light-icon.png" alt="wiselogo"></a>
            </div>
            <div class="header-null"></div>
            <div id="nav-icon">
                <span></span>
                <span></span>
                <span></span>
            </div>

            <div class="header-text">
                <a href="/signup"><p>Реєстрація</p></a>
                <a href="/results"><p>Результати</p></a>
                <a href="/gametable"><p>Таблиця</p></a>
                <a href="/bombardier"><p>Бомбардири</p></a>
            </div>
        </div>

    </div>
</header>
<div class="registration-photo">
 <div class="registration-form">

     <form action="/action_page.php">
            <div class="team-capitan">
                <div class="team-name">
                    <p>Назва команди</p>
                    <input type="text" name="TeamName" placeholder="Назва команди" required>
                </div>
                <div class="capitan">
                    <p>Капітан команди</p>
                    <input type="text" name="CapitanName" placeholder="Прізвище ім'я" required>
                    <input type="tel" name="phone" pattern="[0-9]{10}" placeholder="номер в форматі 10 цифр" required>
                    <input type="email" name="email" placeholder="введіть email" required>
                </div>
            </div>

            <div class="player1-3">
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
            </div>
            </div>
            <div class="player1-3">
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
            </div>
            <div class="player1-3">
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище Ім'я" required>
                </div>
            </div>
            <div class="player1-3">
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище ім'я" required>
                </div>
                <div class="player">
                    <p>Гравець</p>
                    <input type="text" name="player" placeholder="Прізвище ім'я" required>
                </div>
            </div>

     <input type="submit" value="Зареєструватися">
     </form>
 </div>
</div>
        <!--<form action="/action_page.php">
            <div class="offset">Команда <input type="text" name="teamname" placeholder="Назва команди" required></div>
            <div class="offset">Капітан команди <input type="text" name="FirstName" placeholder="Прізвище ім'я" required>
                Телефон <input type="tel" name="phone" pattern="[0-9]{10}" placeholder="номер в форматі 10 цифр" required>
                Email  <input type="email" name="email" placeholder="введіть">
            </div>
            <div class="offset">Заступник капітана <input type="text" name="FirstName" placeholder="Прізвище ім'я" required>
                Телефон <input type="tel" name="phone" pattern="[0-9]{10}" placeholder="номер в форматі 10 цифр" required>
                Email  <input type="email" name="email" placeholder="введіть">
            </div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>
            <div class="offset">Гравець: <input type="text" name="Player" value=""></div>


            <input type="submit" value="Зареєструватися">
        </form>-->
<script src="scrypt.js"></script>


</body>
<script>

</script>
</html>