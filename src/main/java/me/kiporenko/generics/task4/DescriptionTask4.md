
---

## 🪢 **4. Wildcards: The Real Challenge**

**🧪 Task**:
Write a method:

```java
public static void printAll(List<? extends Object> list)
```

Then refactor it to:

```java
public static void printAll(List<?> list)
```

Call it with `List<String>`, `List<Integer>` and explain why `List<Object>` doesn’t accept `List<String>`.

---

