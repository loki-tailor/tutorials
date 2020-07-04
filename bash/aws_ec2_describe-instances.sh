#!/bin/bash
sudo -i aws ec2 describe-instances --filters 'Name=tag:spotinst:aws:ec2:group:name,Values=sp-api.appbazaar.com' | grep -i 'PRIVATEIPADDRESSES' | awk '{ print $4 }'