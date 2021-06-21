import logging.config

#
# created @ Sat Jun 19 2021 2:29:53 pm
# ref @ https://docs.python.org/3/howto/logging.html
#


logging.config.fileConfig('logging.conf')
logger = logging.getLogger('test')

logger.info("roads are dry...")
logger.warning("it's raining..")
logger.debug("it's sunny too")