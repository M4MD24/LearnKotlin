# <div dir="rtl">نطاق الظل</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
الادخال :

"الأرقام": [2, 3, 3, 3, 4, 5, 6],

"الهدف": 3

الاخراج:

[1, 3]

التفسير:
في القائمة [2, 3, 3, 3, 4, 5, 6]، الرقم 3 يظهر أول مرة عند الفهرس 1 وآخر مرة عند الفهرس 3. لذا يكون النطاق [1, 3].

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [5, 7, 7, 8, 8, 10]
target = 8
```

#### <div dir="rtl">المُخرجات</div>

```text
[3, 4]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [5, 7, 7, 8, 8, 10]
target = 6
```

#### <div dir="rtl">المُخرجات</div>

```text
[-1, -1]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = []
target = 0
```

#### <div dir="rtl">المُخرجات</div>

```text
[-1, -1]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [1]
target = 1
```

#### <div dir="rtl">المُخرجات</div>

```text
[0, 0]
```