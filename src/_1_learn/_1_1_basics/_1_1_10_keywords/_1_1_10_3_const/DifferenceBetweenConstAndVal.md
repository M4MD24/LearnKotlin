<div dir="rtl">

`consts` هي ثوابت وقت التجميع. وهذا يعني أن قيمتها يجب تعيينها أثناء وقت التجميع، على عكس `value`، حيث يمكن القيام بذلك في وقت التشغيل.

وهذا يعني أنه لا يمكن تعيين سوى `primitive data types` إلى `const`، وليس نتيجة استدعاء دالة أو منشئ فئة (`class`).

مثال:
</div>

```kt
const val foo = complexFunctionCall()   //Not okay
val fooVal = complexFunctionCall()      //Okay

const val bar = "Hello world"           //Also okay
```