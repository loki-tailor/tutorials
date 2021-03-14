from jsonschema import validate

data = [ 1, 2, 3]

schema = { "items": { "type": "boolean"}, "minItems": 2 }

validate(instance=data, schema=schema)