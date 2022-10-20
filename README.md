# Prevent Double Click
Avoid your click view from double click which will produce a bug

## Installation
#### repositories
```kotlin
maven { url 'https://jitpack.io' }
```

#### dependencies
```kotlin
implementation 'com.github.eriffanani:PreventDoubleClick:1.0.0'
```

## How To Use
* Java
```java
new PreventDoubleClick(() -> {
    // TODO ACTION
});
```
* Kotlin
```kotlin
PreventDoubleClick {
    // TODO ACTION
}
```

### Example use
* Java Function
```java
public void onClickMyButton() {
    new PreventDoubleClick(() -> {
        // TODO ACTION
    });
}
```
* Java View Click Listener
```java
myButton..setOnClickListener(view -> {
    new PreventDoubleClick(() -> {
        // TODO ACTION
    });
});
```

* Kotlin Function
```kotlin
fun onClickMyButton() {
    PreventDoubleClick {
      // TODO ACTION
    }
}
```
* Kotlin View Click Listener
```kotlin
myButton.setOnClickListener {
    PreventDoubleClick {
      // TODO ACTION
    }
}
```
