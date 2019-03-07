# Android_app_seven
### 1.Toast
可以在螢幕上顯示一小段即時訊息,並在幾秒後消失

    Toast.makeText(ListActivity.this, drinks[position], Toast.LENGTH_SHORT).show();
### 2.AlertDialog
螢幕最上層顯示訊息框攔截所有輸入,使用者必須做出回應後才能繼續原本的操作

    new AlertDialog.Builder(this)
                   .setTitle("範例程式")   
                   .setMessage("要到下一題嗎?")
                   .setIcon(android.R.drawable.btn_star)
                   .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           startActivity(new Intent(MainActivity.this, ListActivity.class));
                       }
                   })
                   .setNegativeButton("取消", null)
                   .setCancelable(false)
                   .show();
### 3.交談窗類別名稱
Alert交談窗 = AlertDialog

日期交談窗 = DatePickerDialog

時間交談窗 = TimePickerDialog
### 4.Calender
利用getInstance()來產生此類別

可以取得代表目前日期與時間

Calender.YEAR = 年

Calender.MONTH = 月 (由0算起)

Calender.DAY_OF_MONTH = 日

Calender.HOUR_OF_DAY = 時

Calender.MINUTE = 分
