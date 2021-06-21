import json
#
# created @ Sat Jun 19 2021 2:39:35 pm
# ref @ 
#

def replace_str_in_json(json_as_dict, search_str, replace_str):
    json_str = json.dumps(json_as_dict)
    json_str = json_str.replace(search_str, replace_str)
    return json.loads(json_str)

def prettyFormat(json_str):    
    parsed = json.loads(json_str)
    return json.dumps(parsed, indent=4, sort_keys=False)

def test_1():
    data = '{ "name": "lokeshwar", "surname": "tailor"}'
    print(prettyFormat(data))
    print()
    print(prettyFormat(replace_str_in_json(data,"lokeshwar", "loki")))

test_1()    