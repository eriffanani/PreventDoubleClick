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

### Licence
```license
Copyright 2022 Mukhammad Erif Fanani

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
