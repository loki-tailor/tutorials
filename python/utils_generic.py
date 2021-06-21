import sys
import logging.config

#
# created @ Sat Jun 19 2021 2:30:53 pm
# ref @ 
#



logging.config.fileConfig('logging.conf')
logger = logging.getLogger('generic')

def bye():
    logger.info("error occured, bye..")
    sys.exit(-1)

def sep_1():
    print("="*100)    

def sep_2():
    logger.info("-"*50)

# bye()
# sep_1()
# print()
# sep_2()