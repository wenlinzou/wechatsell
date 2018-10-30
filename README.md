

### 前端api文档

#### 商品列表

`get /sell/buyer/product/list`
返回

```
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "name": null,
            "type": null,
            "foods": [
                {
                    "id": null,
                    "name": null,
                    "price": null,
                    "description": null,
                    "icon": null
                }
            ]
        }
    ]
}
```



#### 创建订单api

`post /sell/buyer/order/create`
参数
`name phone address openid items[productId, productQuantity]`
返回

```
{
    "code": 0,
    "msg": "成功",
    "data": {
        "orderId": "1540884316825817929"
    }
}
```



备注：属性为null，不返回

#### 订单列表

`get /sell/buyer/order/list`
参数
`openid page`:从0开始 size
返回

```
{
    "code": 0,
    "msg": "成功",
    "data": [
        {
            "orderId": "1540883923323744850",
            "buyerName": "李四",
            "buyerPhone": "18912341234",
            "buyerAddress": "家门口",
            "buyerOpenid": "as5sa56d4a6s4a6sd4fas6d4",
            "orderAmount": 15,
            "orderStatus": 0,
            "payStatus": 0,
            "createTime": 1540883924,
            "updateTime": 1540883924,
            "orderDetailList": null
        }
    ]
}
```



#### 订单详情

`get /sell/buyer/order/detail`
参数
`openid orderId`
返回

```
{
    "code": 0,
    "msg": "成功",
    "data": {
        "orderId": "1540883923323744850",
        "buyerName": "李四",
        "buyerPhone": "18912341234",
        "buyerAddress": "家门口",
        "buyerOpenid": "as5sa56d4a6s4a6sd4fas6d4",
        "orderAmount": 15,
        "orderStatus": 0,
        "payStatus": 0,
        "createTime": 1540883924,
        "updateTime": 1540883924,
        "orderDetailList": [
            {
                "detailId": "1540883923853206220",
                "orderId": "1540883923323744850",
                "productId": "123568",
                "productName": "芒果冰",
                "productPrice": 7.5,
                "productQuantity": 2,
                "productIcon": "http://mg.jpg"
            }
        ]
    }
}
```



#### 取消订单

`post /sell/buyer/order/cancel`
参数
`openid orderId`
返回

```
{
    "code": 0,
    "msg": "成功",
    "data": null
}
```


