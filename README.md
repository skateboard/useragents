<h1 align="center">UserAgents</h1>
<div align="center">
  <strong>A simple random useragent generator!.</strong>
</div>
<br />

# Maven
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

    <dependency>
	    <groupId>com.github.skateboard</groupId>
	    <artifactId>useragents</artifactId>
	    <version>Tag</version>
	</dependency>
```

# Gradle
```gradle
	repositories {
		maven { url 'https://jitpack.io' }
	}

    dependencies {
		implementation 'com.github.skateboard:discord-auth:Tag'
	}
```

# Credit
Big thanks to [uarand](https://github.com/corpix/uarand) for the useragents list!

# Usage
```java
    public static void main(String[] args) {
        System.out.println(UserAgents.randomUserAgent());
    }
```