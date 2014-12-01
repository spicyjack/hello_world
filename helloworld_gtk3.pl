#!/usr/bin/perl -w

use strict;
# Gtk3->init; works if you don't use -init on use
use Gtk3 q(-init);

# create the window
my $window = Gtk3::Window->new (q(toplevel));
# create the button
my $button = Gtk3::Button->new (q(Quit));
# connect the button's 'click' signal to an action
$button->signal_connect (clicked => sub { Gtk3->main_quit });
# add the button to the window
$window->add ($button);
# show the window
$window->show_all;
# yield to Gtk3 and wait for user input
Gtk3->main;
