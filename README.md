LicenseAdapter
===

Adapter library for RecyclerView to display your app's OSS dependencies.

This library fetch license text from GitHub(and your custom location), so technically this library is capable of displaying any license.

## Installation

LicenseAdapter is distributed via jCenter.

```gradle
dependencies {
  compile 'net.yslibrary.licenseadapter:licenseadapter:1.0.1'
}
```


## Usage


Don't for get to add `android.permission.INTERNET` permission to your AndroidManifest.


```java
// create list of licenses
List<LicenseEntry> dataset = new ArrayList<>();

dataset.add(Licenses.fromGitHub("google/dagger"));
dataset.add(Licenses.fromGitHub("jakewharton/timber"));
dataset.add(Licenses.fromGitHub("reactivex/rxjava", Licenses.LICENSE_NO_EXTENSION));
dataset.add(Licenses.fromGitHub("reactivex/rxandroid", Licenses.LICENSE_NO_EXTENSION));
dataset.add(Licenses.fromGitHub("realm/realm-java", Licenses.LICENSE_NO_EXTENSION));
dataset.add(Licenses.fromGitHub("square/retrofit"));
dataset.add(Licenses.fromGitHub("yshrsmz/simple-preferences"));

// create adapter
LicenseAdapter adapter = new LicenseAdapter(dataset);
RecyclerView list = (RecyclerView) findViewById(R.id.list);
list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
list.setAdapter(adapter);

// finally load license text from Web
Licenses.load(dataset);
```

## License

    Copyright 2016 Shimizu Yasuhiro (yshrsmz)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.