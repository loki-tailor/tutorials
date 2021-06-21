#
# created @ Sat Jun 19 2021 2:46:23 pm
# ref @ 
#

import os
import logging.config
import utils_generic as utils

logging.config.fileConfig('logging.conf')
logger = logging.getLogger('generic')

def del_files_matching_pattern(dir_path, pattern, take_backup):
    utils.sep_1()

    # check if permission is there to delete
    if os.access(dir_path, os.W_OK) == False:
        logger.fatal("dir absent or no permission to delete @ {}".format(dir_path))\

def test_1():
    del_files_matching_pattern("tem","*.json", True)

test_1()    