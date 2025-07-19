package edwiresplus.common;


import electrodynamics.common.block.connect.BlockWire;
import electrodynamics.common.block.subtype.SubtypeWire;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import voltaic.api.ISubtype;
import voltaic.api.network.cable.type.IWire;
import voltaic.common.tags.VoltaicTags;
import voltaic.prefab.utilities.math.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public enum SubtypeWirePlus implements ISubtype, IWire {

    ceramicinsulatedcoppercyan(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.CYAN, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcoppergray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.GRAY, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcopperlightblue(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcopperlightgray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcopperlime(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIME, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcoppermagenta(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.MAGENTA, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcopperorange(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.ORANGE, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcopperpink(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PINK, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedcopperpurple(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PURPLE, VoltaicTags.Items.CERAMIC_COPPER_WIRES),
    ceramicinsulatedgoldcyan(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.CYAN, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.GRAY, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldlightblue(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldlightgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldlime(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIME, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldmagenta(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.MAGENTA, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldorange(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.ORANGE, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldpink(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PINK, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedgoldpurple(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PURPLE, VoltaicTags.Items.CERAMIC_GOLD_WIRES),
    ceramicinsulatedironcyan(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.CYAN, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedirongray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.GRAY, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironlightblue(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironlightgray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironlime(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIME, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironmagenta(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.MAGENTA, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironorange(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.ORANGE, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironpink(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PINK, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedironpurple(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PURPLE, VoltaicTags.Items.CERAMIC_IRON_WIRES),
    ceramicinsulatedsilvercyan(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.CYAN, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilvergray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.GRAY, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilverlightblue(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilverlightgray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilverlime(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIME, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilvermagenta(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.MAGENTA, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilverorange(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.ORANGE, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilverpink(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PINK, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsilverpurple(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PURPLE, VoltaicTags.Items.CERAMIC_SILVER_WIRES),
    ceramicinsulatedsuperconductivecyan(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.CYAN, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivegray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.GRAY, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivelightblue(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivelightgray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivelime(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIME, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivemagenta(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.MAGENTA, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductiveorange(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.ORANGE, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivepink(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PINK, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedsuperconductivepurple(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PURPLE, VoltaicTags.Items.CERAMIC_SUPERCONDUCTIVE_WIRES),
    ceramicinsulatedtincyan(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.CYAN, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtingray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.GRAY, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinlightblue(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinlightgray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinlime(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.LIME, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinmagenta(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.MAGENTA, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinorange(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.ORANGE, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinpink(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PINK, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    ceramicinsulatedtinpurple(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.CERAMIC, SubtypeWire.WireClass.CERAMIC, WireColorPlus.PURPLE, VoltaicTags.Items.CERAMIC_TIN_WIRES),
    highlyinsulatedcoppercyan(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.CYAN, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcoppergray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.GRAY, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcopperlightblue(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcopperlightgray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcopperlime(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIME, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcoppermagenta(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.MAGENTA, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcopperorange(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.ORANGE, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcopperpink(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PINK, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedcopperpurple(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PURPLE, VoltaicTags.Items.THICK_COPPER_WIRES),
    highlyinsulatedgoldcyan(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.CYAN, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.GRAY, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldlightblue(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldlightgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldlime(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIME, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldmagenta(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.MAGENTA, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldorange(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.ORANGE, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldpink(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PINK, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedgoldpurple(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PURPLE, VoltaicTags.Items.THICK_GOLD_WIRES),
    highlyinsulatedironcyan(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.CYAN, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedirongray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.GRAY, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironlightblue(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironlightgray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironlime(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIME, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironmagenta(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.MAGENTA, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironorange(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.ORANGE, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironpink(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PINK, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedironpurple(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PURPLE, VoltaicTags.Items.THICK_IRON_WIRES),
    highlyinsulatedsilvercyan(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.CYAN, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilvergray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.GRAY, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilverlightblue(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilverlightgray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilverlime(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIME, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilvermagenta(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.MAGENTA, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilverorange(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.ORANGE, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilverpink(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PINK, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsilverpurple(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PURPLE, VoltaicTags.Items.THICK_SILVER_WIRES),
    highlyinsulatedsuperconductivecyan(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.CYAN, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivegray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.GRAY, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivelightblue(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivelightgray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivelime(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIME, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivemagenta(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.MAGENTA, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductiveorange(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.ORANGE, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivepink(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PINK, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedsuperconductivepurple(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PURPLE, VoltaicTags.Items.THICK_SUPERCONDUCTIVE_WIRES),
    highlyinsulatedtincyan(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.CYAN, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtingray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.GRAY, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinlightblue(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinlightgray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinlime(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.LIME, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinmagenta(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.MAGENTA, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinorange(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.ORANGE, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinpink(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PINK, VoltaicTags.Items.THICK_TIN_WIRES),
    highlyinsulatedtinpurple(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.THICK_WOOL, SubtypeWire.WireClass.THICK, WireColorPlus.PURPLE, VoltaicTags.Items.THICK_TIN_WIRES),
    insulatedcoppercyan(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.CYAN, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcoppergray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.GRAY, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcopperlightblue(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcopperlightgray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcopperlime(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIME, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcoppermagenta(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.MAGENTA, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcopperorange(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.ORANGE, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcopperpink(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PINK, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedcopperpurple(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PURPLE, VoltaicTags.Items.INSULATED_COPPER_WIRES),
    insulatedgoldcyan(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.CYAN, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.GRAY, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldlightblue(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldlightgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldlime(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIME, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldmagenta(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.MAGENTA, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldorange(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.ORANGE, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldpink(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PINK, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedgoldpurple(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PURPLE, VoltaicTags.Items.INSULATED_GOLD_WIRES),
    insulatedironcyan(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.CYAN, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedirongray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.GRAY, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironlightblue(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironlightgray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironlime(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIME, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironmagenta(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.MAGENTA, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironorange(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.ORANGE, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironpink(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PINK, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedironpurple(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PURPLE, VoltaicTags.Items.INSULATED_IRON_WIRES),
    insulatedsilvercyan(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.CYAN, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilvergray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.GRAY, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilverlightblue(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilverlightgray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilverlime(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIME, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilvermagenta(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.MAGENTA, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilverorange(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.ORANGE, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilverpink(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PINK, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsilverpurple(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PURPLE, VoltaicTags.Items.INSULATED_SILVER_WIRES),
    insulatedsuperconductivecyan(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.CYAN, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivegray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.GRAY, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivelightblue(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivelightgray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivelime(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIME, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivemagenta(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.MAGENTA, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductiveorange(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.ORANGE, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivepink(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PINK, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedsuperconductivepurple(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PURPLE, VoltaicTags.Items.INSULATED_SUPERCONDUCTIVE_WIRES),
    insulatedtincyan(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.CYAN, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtingray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.GRAY, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinlightblue(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinlightgray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinlime(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.LIME, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinmagenta(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.MAGENTA, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinorange(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.ORANGE, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinpink(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PINK, VoltaicTags.Items.INSULATED_TIN_WIRES),
    insulatedtinpurple(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.INSULATED, WireColorPlus.PURPLE, VoltaicTags.Items.INSULATED_TIN_WIRES),
    logisticswirecoppercyan(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.CYAN, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecoppergray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.GRAY, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecopperlightblue(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecopperlightgray(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecopperlime(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIME, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecoppermagenta(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.MAGENTA, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecopperorange(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.ORANGE, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecopperpink(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PINK, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswirecopperpurple(SubtypeWire.WireMaterial.COPPER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PURPLE, VoltaicTags.Items.LOGISTICAL_COPPER_WIRES),
    logisticswiregoldcyan(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.CYAN, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.GRAY, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldlightblue(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldlightgray(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldlime(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIME, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldmagenta(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.MAGENTA, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldorange(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.ORANGE, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldpink(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PINK, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswiregoldpurple(SubtypeWire.WireMaterial.GOLD, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PURPLE, VoltaicTags.Items.LOGISTICAL_GOLD_WIRES),
    logisticswireironcyan(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.CYAN, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireirongray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.GRAY, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironlightblue(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironlightgray(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironlime(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIME, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironmagenta(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.MAGENTA, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironorange(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.ORANGE, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironpink(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PINK, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswireironpurple(SubtypeWire.WireMaterial.IRON, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PURPLE, VoltaicTags.Items.LOGISTICAL_IRON_WIRES),
    logisticswiresilvercyan(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.CYAN, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilvergray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.GRAY, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilverlightblue(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilverlightgray(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilverlime(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIME, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilvermagenta(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.MAGENTA, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilverorange(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.ORANGE, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilverpink(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PINK, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresilverpurple(SubtypeWire.WireMaterial.SILVER, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PURPLE, VoltaicTags.Items.LOGISTICAL_SILVER_WIRES),
    logisticswiresuperconductivecyan(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.CYAN, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivegray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.GRAY, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivelightblue(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivelightgray(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivelime(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIME, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivemagenta(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.MAGENTA, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductiveorange(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.ORANGE, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivepink(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PINK, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiresuperconductivepurple(SubtypeWire.WireMaterial.SUPERCONDUCTIVE, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PURPLE, VoltaicTags.Items.LOGISTICAL_SUPERCONDUCTIVE_WIRES),
    logisticswiretincyan(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.CYAN, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretingray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.GRAY, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinlightblue(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTBLUE, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinlightgray(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIGHTGRAY, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinlime(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.LIME, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinmagenta(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.MAGENTA, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinorange(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.ORANGE, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinpink(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PINK, VoltaicTags.Items.LOGISTICAL_TIN_WIRES),
    logisticswiretinpurple(SubtypeWire.WireMaterial.TIN, SubtypeWire.InsulationMaterial.WOOL, SubtypeWire.WireClass.LOGISTICAL, WireColorPlus.PURPLE, VoltaicTags.Items.LOGISTICAL_TIN_WIRES);

    public static final HashMap<IWire.IWireMaterial, HashMap<IWire.IInsulationMaterial, HashMap<IWire.IWireClass, HashMap<IWireColor, BlockWire>>>> WIRES = new HashMap();
    public static final HashSet<IWireMaterial> WIRE_MATERIALS = new HashSet();
    private final IWireMaterial material;
    private final IInsulationMaterial insulation;
    private final IWireClass wireClass;
    private final IWire.IWireColor color;
    @org.jetbrains.annotations.Nullable
    private final TagKey<Item> itemTag;
    private final boolean isDefaultColor;

    SubtypeWirePlus(IWireMaterial material, IInsulationMaterial insulation, IWireClass wireClass,
                    WireColorPlus color, TagKey<Item> itemTag) {
        this.material = material;
        this.insulation = insulation;
        this.wireClass = wireClass;
        this.color = color;
        this.itemTag = itemTag;
        this.isDefaultColor = false;
    }

    @Override public String tag() {return "wire" + this.name();}
    @Override public String forgeTag() {return this.tag();}
    @Override public boolean isItem() {return false;}
    @Override public double getResistance() {return material.resistance();}
    @Override public long getAmpacity() {return material.ampacity();}
    @Override public IWireClass getWireClass() {return wireClass;}
    @Override public IInsulationMaterial getInsulation() {return insulation;}
    @Override public IWireMaterial getWireMaterial() {return material;}
    @Override public IWireColor getWireColor() {return color;}
    @Override public IWireColor getDefaultColor() {return SubtypeWire.WireColor.BLACK;}

    @Override public @Nullable TagKey<Item> getItemTag() {return itemTag;}
    @Override public boolean isDefaultColor() {return false;}


    //Extended colors for the remaining vanilla dyes, this is where the headache starts...
    public enum WireColorPlus implements IWireColor {
        GRAY(71, 79, 82, 255, Tags.Items.DYES_GRAY),
        LIGHTGRAY(157, 157, 151, 255, Tags.Items.DYES_LIGHT_GRAY),
        ORANGE(249, 128, 29, 255, Tags.Items.DYES_ORANGE),
        LIME(128, 199, 31, 255, Tags.Items.DYES_LIME),
        LIGHTBLUE(58, 179, 218, 255, Tags.Items.DYES_LIGHT_BLUE),
        CYAN(22, 156, 156, 255, Tags.Items.DYES_CYAN),
        PURPLE(174, 114, 241, 255, Tags.Items.DYES_PURPLE),
        MAGENTA(199, 78, 189, 255, Tags.Items.DYES_MAGENTA),
        PINK(243, 139, 170, 255, Tags.Items.DYES_PINK);

        public final Color color;
        public final TagKey<Item> dyeTag;

        private WireColorPlus(int r, int g, int b, int a, TagKey<Item> dyeTag) {
            color = new Color(r, g, b, a);
            this.dyeTag = dyeTag;

        }

        @Override public @NotNull Color getColor() {return color;}
        @Override public @NotNull TagKey<Item> getDyeTag() {return dyeTag;}
    }
    @javax.annotation.Nullable
    public static BlockWire getWireP(IWire.IWireMaterial wireMaterial, IWire.IInsulationMaterial insulation, IWire.IWireClass wireClass, IWire.IWireColor color) {
        return (BlockWire)((HashMap)((HashMap)((HashMap)WIRES.getOrDefault(wireMaterial, new HashMap())).getOrDefault(insulation, new HashMap())).getOrDefault(wireClass, new HashMap())).getOrDefault(color, (Object)null);
    }

    public static BlockWire[] getWiresP(SubtypeWire.WireMaterial[] conductors, SubtypeWire.InsulationMaterial insulation, SubtypeWire.WireClass wireClass, SubtypeWirePlus.WireColorPlus... colors) {
        List<BlockWire> list = new ArrayList();

        for(SubtypeWire.WireMaterial conductor : conductors) {
            for(SubtypeWirePlus.WireColorPlus color : colors) {
                BlockWire wire = getWireP(conductor, insulation, wireClass, color);
                if (wire != null) {
                    list.add(wire);
                }
            }
        }

        return (BlockWire[])list.toArray(new BlockWire[0]);
    }

}
