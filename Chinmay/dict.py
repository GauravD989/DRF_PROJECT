def dct(var):
    dict_1 = {}
    
    if isinstance(var, dict):
        for key, value in var.items():
            if isinstance(value, int):
                dict_1[key] = value ** 2
            elif isinstance(value, str):
                dict_1[key] = value[::-1]
            elif isinstance(value, list):
                def lst(lst_values):
                    list_1 = []
                    for i in lst_values:
                        if isinstance(i, int):
                            list_1.append(i ** 2)
                        elif isinstance(i, str):
                            list_1.append(i[::-1])
                        elif isinstance(i, list):
                            list_1.append(lst(i))
                    return list_1

                dict_1[key] = lst(value)
            elif isinstance(value, dict):
                dict_1[key] = dct(value)

    return dict_1

input_dict = {
    "name": "John Doe",
    "age": 22,
    "Address": [
        31, "Baker street, Atlanta",
        [
            53,
            "Northen lights, US"
        ]
    ],
    "components": [
        "camera_server_ipu",
        3.14,
        123,
        999,
        "This is test",
        "Palindrome",
        "aoaoaoa",
        [
            "camera_server_ipu",
            3.14,
            123,
            999,
            "This is test",
            "Palindrome",
            "qs-hub-platform",
            "fusion_server",
            "camera_server_ipu"
        ]
    ],
    "status": {
        "en": "IPU",
        "kn": "IPU",
        "zh": "ipu"
    },
    "version": "a60b3f3a1478",
    "qt_conf_version": "1.0.0",
    "agv_ip": "10.1.1.23",
    "agv_port": 8088,
    "logpath": "/data/fw/log/program/"
}

print(dct(input_dict))
