# KeyUPtoBroadcast

Устанавливает в Android службу, отслеживающую нажатие аппаратных кнопок, и передает их код как broadcast. 

Использование:
1) Установить службу. 
2) В настройках -> Спец. возможности -> KeyUP to broadcast -> Включить.
3) Intent filter = "org.innovait.action.NEW_KEY_UP", getStringExtra("KEY_CODE")
4) Profit
