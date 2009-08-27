#!/usr/bin/perl -w
#
# hiworld - "Hello World" with a Button and implicit class bindings.
use Tk;
use strict;
my $mw = MainWindow->new;
my $button = $mw->Button(-text => 'Hi World', -command => \&exit);
$button->pack;

MainLoop;
