import smtplib
import datetime
from time import sleep
import shortuuid

while(1):

    try:

        gmail_user = ''
        gmail_password = ''

        sent_from = gmail_user
        to = ['']
        body = """
        body goes here
        """

        email_text = """\
        From: {}
        To: {}
        Subject: <sub>

        {}
        """.format(sent_from, ", ".join(to), body)


        print('started')
        server = smtplib.SMTP_SSL('smtp.gmail.com', 465)
        server.ehlo()
        server.login(gmail_user, gmail_password)

        # send same mail multiple times
        for i in range(0,100):
            subject = 'INTERNET NOT WORKING : {} @ {}'.format(datetime.datetime.now(), shortuuid.uuid())
            temp = email_text.replace("<sub>", subject)
            print(i, subject)
            server.sendmail(sent_from, to, temp)    
            print("doing next...")
            sleep(5)

        server.close()

        print('Email sent!')
    except:
        print("trying again in 10 seconds...")
        sleep(60)        
