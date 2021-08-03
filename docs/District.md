# District

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**mdrNumber** | **String** |  |  [optional]
**ncesId** | **String** |  |  [optional]
**sisType** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**lastSync** | **String** |  |  [optional]
**error** | **String** |  |  [optional]
**pauseStart** | **String** |  |  [optional]
**pauseEnd** | **String** |  |  [optional]
**launchDate** | **String** |  |  [optional]
**portalUrl** | **String** |  |  [optional]
**loginMethods** | **List&lt;String&gt;** |  |  [optional]
**districtContact** | [**DistrictAdmin**](DistrictAdmin.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
PENDING | &quot;pending&quot;
ERROR | &quot;error&quot;
PAUSED | &quot;paused&quot;
EMPTY | &quot;&quot;
SUCCESS | &quot;success&quot;
