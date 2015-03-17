# Purpose
In some cases it may not be apparent to end user how java is resolving the hostnames of the hadoop cluster nodes.  This could be because of a issue with any of the following configuration settings

- /etc/sysconfig/network
- /etc/resolve.conf
- /etc/hosts


# Usage

This tool is expected to be run locally on the client in question and can not be used to verify a remote clients DNS configuration settings.

##Verify the local hostname resolution

```
 java -classpath HadoopDNSVerifier-1.0.jar hadoop.troubleshooting.HadoopDNSVerifier.CheckLocal
```

Output:

```
  IP:10.181.22.149 hostname:hdm4.gphd.local canonicalName:hdm4.gphd.local
```

##Verify remote hostname resolution

```
 java -classpath HadoopDNSVerifier-1.0.jar hadoop.troubleshooting.HadoopDNSVerifier.CheckRemote hdm3.gphd.local
```

Output:

```
 IP:10.181.22.149 hostname:hdm3.gphd.local canonicalName:hdm3.gphd.local
```

#Build

```
 mvn package
```
