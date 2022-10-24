# Prevent Double Click
Avoid your click view from double click which will produce a bug.

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

### Output
* Normal Button
<img width="300px" src="https://user-images.githubusercontent.com/26743731/197451760-bb131aaf-e06c-46c4-b00d-01128a49073e.gif"/>

* Prevent Double Click
<img width="300px" src="https://user-images.githubusercontent.com/26743731/197451841-ac431afc-5736-4520-b87c-1540fb28c64b.gif"/>

### Custom Interval

The button can be re-clicked after the specified interval is completed. The default interval is 600 milliseconds.
* Java
```java
long interval = 1000L; // 1 seconds
new PreventDoubleClick(interval, () -> {
    // TODO ACTION
});
```

* Kotlin
```kotlin
val interval = 1000L // 1 seconds
PreventDoubleClick(interval) {
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
myButton.setOnClickListener(view -> {
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
