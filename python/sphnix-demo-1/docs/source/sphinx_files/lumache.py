def get_random_ingredients(kind=None):
    """
    [from code] Return a list of random ingredients as strings.

    :param kind: [from code] Optional "kind" of ingredients.
    :type kind: list[str] or None [from code] 
    :raise lumache.InvalidKindError: [from code] If the kind is invalid.
    :return: [from code] The ingredients list.
    :rtype: list[str] [from code] 

    """
    # return ["eggs", "bacon", "spam"]
    return ["shells", "gorgonzola", "parsley"]

class InvalidKindError(Exception):
    """Raised if the kind is invalid."""
    pass